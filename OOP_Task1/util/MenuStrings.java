package OOP_Task1.util;


public enum MenuStrings {
    BE_STUDENT("Хотите поступить на учебу (создать профиль студента)."),
    BE_TEACHER("Хотите стать членом преподавательского состава (создать профиль учителя и оставить резюме)."),
    EXIT("Выход."),
    EDIT_PROFILE("Меню редактирования профиля"),
    EDIT_NAME("Редактировать имя"),
    EDIT_LASTNAME("Редактировать фамилию"),
    ABOUT_INFO("Желаете посмотреть информацию об Университете?"),
    INFO("Спасибо что посетили Университет GB."),
    MAIN_MENU("Вы в главном меню Универстита GB. Выберите действие, которое хотите совершить..."),
    NEW_NAME("Введите ваше имя: "),
    NEW_LASTNAME("Введите вашу фамилию: "),
    OUR_STUDENTS("Просмотреть список наших студентов."),
    OUR_TEACHERS("Ознакомиться с преподавательским составом Университета GB."),
    IS_CONTINUE("Вы желаете продолжить? y/n"),
    ADD_FRIEND("Только сейчас, любой Ваш друг автоматически становиться студентом нашего Университета. Хотите пригласить друга?"),
    BYE("Спасибо за внимание. Ждем вашего скорейшего возвращения в Университет GB."),
    SUMMARY("Меня зовут и я буду у Вас преподавать"),
    ADDITIONAL_MENU("Вы во внутреннем меню Университета GB. Выберите действие, которое хотите выполнить."),
    ADD_STUDENT("Добавить студента."),
    ADD_TEACHER("Добавить учителя."),
    FIND_BI_ID("Найти по ID.");
    

    private final String description;

    MenuStrings(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
