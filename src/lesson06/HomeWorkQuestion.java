package lesson06;

public class HomeWorkQuestion {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "¬опрос: что нужно изучить, чтобы устроитс€ на работу?" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Languages: Java core 8+, frameworks: Spring (Spring Security, Spring Boot), JPA (Hibernate), Servers (Tomcat), \nVersion control system: GitLab (+CI/CD), build tools: Gradle, Maven, testing tools: JUnit, Databases: Postgres, MongoDB, \nа также необходимо подт€нуть английский €зык до уровн€ B1 и выше" + ANSI_RESET);
        System.out.println(ANSI_RED + "¬опрос: на какую зарплату вы рассчитываете?" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "без опыта работы рассчитывать на зарплату более 500-600$ не приходитс€))" + ANSI_RESET);
        System.out.println(ANSI_RED + "¬опрос: через сколько будете отправл€ть резюме?" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "ѕосле изучени€ €зыка програмировани€ джава и других вышеуказанных стек технологий. ѕо времени пока сказать затруднительно" + ANSI_RESET);
        System.out.println(ANSI_RED + "¬опрос: сколько часов в день и в неделю занимаетесь джавой?" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "«анимаюсь в среднем 2 - 3 часа в день, около 20 в неделю, этого €вно не достаточно, \nно сказываетс€ непредвиденна€ сильна€ загруженность на основной работе " + ANSI_RESET);
        System.out.println(ANSI_RED + "¬опрос: какова ¬аша цель и что мотивирует?" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "хочу помен€ть род де€тельности и работать удаленно, мотивирует то, что много знакомых уже достигли определенного уровн€ в IT отрасли " + ANSI_RESET);
        System.out.println(ANSI_RED + "¬опрос: что бы вы хотели улучшить в наших уроках, чего не хватает, как бы они выгл€дели еще круче?" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "мне все подходит)), очень интересно и доходчиво, можно всегда пересмотреть запись урока, если с первого раза что-то не пон€л, \nвсегда можно задать интересующие вопросы, также удобный и пон€тный личный кабинет,\nхотелось бы чтобы давалось больше времени на выполнение домашек))" + ANSI_RESET);
    }
}
