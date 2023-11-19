// Вложение фотография
class PhotoAttachment(param : Photo) : Attachment {
    override val type: String = "photo"
    val photo = param

    override fun toString() : String{
        return "\n  $photo"
    }
}
