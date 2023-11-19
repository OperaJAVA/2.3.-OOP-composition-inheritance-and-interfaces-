// Объект, описывающий место
data class Place(
    val id : Int, // идентификатор места
    val title : String, // название места
    val latitude : Int, // географическая широта, заданная в градусах (от -90 до 90)
    val longitude : Int, // integer	географическая широта, заданная в градусах (от -90 до 90)
    val created : Int, // дата создания места в Unixtime
    val icon : String, // иконка места, URL изображения
    val checkins : Int, // число отметок в этом месте
    val updated : Int, // дата обновления места в Unixtime
    val type : Int, // тип места
    val country : Int, // идентификатор страны
    val city : Int, // идентификатор города
    val address : String // адрес места
)