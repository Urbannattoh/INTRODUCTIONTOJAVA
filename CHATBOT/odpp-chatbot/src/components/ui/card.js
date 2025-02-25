export function Card({ children, className }) {
    return <div className={`p-3 border rounded ${className}`}>{children}</div>;
  }
  
  export function CardContent({ children, className }) {
    return <div className={`p-2 ${className}`}>{children}</div>;
  }
  