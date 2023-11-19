// Объект, описывающий фотографию
data class Photo(
    val id : Int, // Идентификатор фотографии.
    val albumId : Int, // Идентификатор альбома, в котором находится фотография.
    val ownerId : Int, // Идентификатор владельца фотографии.
    val userId : Int, // Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text : String, // Текст описания фотографии.
    val date : Int, // Дата добавления в формате Unixtime.
    val sizes : Array<Sizes> = emptyArray(),
    val width : Int, // Ширина оригинала фотографии в пикселах.
    val height : Int // Высота оригинала фотографии в пикселах.
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Photo

        if (id != other.id) return false
        if (albumId != other.albumId) return false
        if (ownerId != other.ownerId) return false
        if (userId != other.userId) return false
        if (text != other.text) return false
        if (date != other.date) return false
        if (!sizes.contentEquals(other.sizes)) return false
        if (width != other.width) return false
        if (height != other.height) return false

        return true
    }

    override fun hashCode(): Int {
        var result=id
        result=31 * result + albumId
        result=31 * result + ownerId
        result=31 * result + userId
        result=31 * result + text.hashCode()
        result=31 * result + date
        result=31 * result + sizes.contentHashCode()
        result=31 * result + width
        result=31 * result + height
        return result
    }
}
