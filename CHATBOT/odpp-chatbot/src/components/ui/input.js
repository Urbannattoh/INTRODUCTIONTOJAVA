export function Input({ value, onChange, placeholder, className }) {
    return <input className={`border p-2 rounded ${className}`} value={value} onChange={onChange} placeholder={placeholder} />;
  }
  