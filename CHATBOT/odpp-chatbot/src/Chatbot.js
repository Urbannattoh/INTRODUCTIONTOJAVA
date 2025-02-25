import React, { useState, useEffect } from "react";
import { Send } from "lucide-react";

const responses = {
  "hello": "Hello! How can I assist you today?",
  "how do I check my case status?": "You can check your case status by visiting the ODPP case tracking portal and entering your case number.",
  "how do I file a complaint?": "To file a complaint, visit the ODPP website, navigate to the complaints section, and fill out the complaint form.",
  "contact details": "You can reach ODPP Kenya via email at info@odpp.go.ke or call +254-123-456-789.",
  "what are the working hours?": "ODPP offices are open Monday to Friday from 8:00 AM to 5:00 PM.",
  "where are ODPP offices located?": "ODPP Kenya offices are located in Nairobi at NSSF Building, Block A, Harambee Avenue.",
};

export default function Chatbot() {
  const [messages, setMessages] = useState([{ text: "Welcome to ODPP Chatbot! How can I help you?", sender: "bot" }]);
  const [input, setInput] = useState("");

  useEffect(() => {
    const chatContainer = document.getElementById("chat-container");
    if (chatContainer) {
      chatContainer.scrollTop = chatContainer.scrollHeight;
    }
  }, [messages]);

  const handleSend = () => {
    if (!input.trim()) return;
    
    const userMessage = { text: input, sender: "user" };
    const botResponse = responses[input.toLowerCase()] || "I'm sorry, I don't understand that. Please visit the ODPP website for more details.";
    
    setMessages([...messages, userMessage, { text: botResponse, sender: "bot" }]);
    setInput("");
  };

  return (
    <div className="flex items-center justify-center min-h-screen bg-gray-100">
      <div className="flex flex-col w-full max-w-2xl mx-auto p-6 border rounded-xl shadow-2xl bg-gradient-to-r from-blue-50 to-blue-100">
        <div id="chat-container" className="h-[500px] overflow-y-auto p-6 border-b bg-white rounded-lg shadow-inner">
          {messages.map((msg, index) => (
            <div key={index} className={`p-4 rounded-lg mb-3 text-lg shadow-md ${msg.sender === "bot" ? "bg-gray-200 text-gray-800" : "bg-blue-500 text-white self-end"}`}>
              <div className="p-2">{msg.text}</div>
            </div>
          ))}
        </div>
        <div className="flex items-center p-4 bg-white rounded-lg shadow-md mt-4">
          <input 
            value={input} 
            onChange={(e) => setInput(e.target.value)} 
            placeholder="Type a message..." 
            className="flex-1 p-4 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400 shadow-sm text-lg"
          />
          <button onClick={handleSend} className="ml-3 bg-blue-500 hover:bg-blue-600 text-white px-6 py-3 rounded-lg shadow-md transition duration-300 text-lg">
            <Send size={24} />
          </button>
        </div>
      </div>
    </div>
  );
}
