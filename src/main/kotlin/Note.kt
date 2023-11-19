// Объект, описывающий заметку
data class Note(
    val id : Int, // Идентификатор заметки.
    val owner_id : Int, // Идентификатор владельца заметки.
    val title : String, // Заголовок заметки.
    val text : String, // Текст заметки.
    val date : Int, // Дата создания заметки в формате Unixtime.
    val comments : Int, // Количество комментариев.
    val readComments : Int, // Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).
    val viewUrl : String, // URL страницы для отображения заметки.
    val privacyView : String, // Настройки приватности просмотра заметки
    val privacyComment : String, // Настройки приватности комментирования заметки
    val canComment : Boolean, // Есть ли возможность оставлять комментарии
    val textWiki : String // Тэги ссылок на wiki
)
