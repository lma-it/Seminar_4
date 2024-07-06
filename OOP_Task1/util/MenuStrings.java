package OOP_Task1.util;

public enum MenuStrings {
    BE_STUDENT("Поступить на учебу (создать профиль студента)."),
    BE_TEACHER("Стать членом преподавательского состава (создать профиль учителя и оставить резюме)."),
    EXIT("Выход."),
    EDIT_PROFILE("Редактировать профиль."),
    EDIT_NAME("Редактировать имя"),
    EDIT_LASTNAME("Редактировать фамилию"),
    EDIT_ID("Редактирвать id."),
    INFO("Спасибо что посетили Университет GB."),
    MAIN_MENU("Вы в главном меню Универстита GB. Выберите действие, которое хотите совершить...");

    private final String description;

    MenuStrings(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
