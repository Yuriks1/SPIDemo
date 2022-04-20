import org.example.greet.Greeting;
import org.example.provide.EnglishGreeting;
import org.example.provide.SwedishGreeting;

module org.fungover.greetingsprovider {
    requires org.example.greeting;
    provides Greeting with SwedishGreeting, EnglishGreeting;
}