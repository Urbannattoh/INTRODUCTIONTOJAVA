public class namingconvention
{
    public static void main(String[] args) 
    {
        
        // Class/Interface -> 	PascalCase	e.g StringBuilder, Student, DatabaseConnection, Interface: Runnable, Serializable, PaymentGateway
        // Method	-> camelCase	e.g getUserName(), calculateTotal(), getUserName(), isValid()
        // Variable	-> camelCase	e.g studentCount, int count, double salary
        // Constant	-> UPPER_SNAKE_CASE	e.g MAX_WIDTH, MAX_SIZE, DEFAULT_TIMEOUT, PI
        // Package	-> lowercase	e.g java.util, com.company.project.util, org.apache.commons
        // Enum Type ->	PascalCase	e.g DayOfWeek
        // Enum Constant ->	UPPER_SNAKE_CASE	e.g FRIDAY, MONDAY, MAX_PRIORITY
        // Generic Type	-> Single uppercase	e.g T, E, K
        // Annotations  -> PascalCase e.g @Override, @FunctionalInterface, @Deprecated
        // Exceptions -> Class names end with "Exception" e.g IOException, CustomValidationException
        // Booleans -> Prefix with is/has/can for clarity e.g isActive, hasChildren, canExecute
        // Acronyms -> Treat acronyms as words (only the first letter is capitalized) e.g parseXml() (not parseXML()), UrlParser (not URLParser)

    }
}

