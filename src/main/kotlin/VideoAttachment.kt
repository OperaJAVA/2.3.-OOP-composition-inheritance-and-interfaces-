class VideoAttachment(param : Video) : Attachment {
    override val type: String = "video"
    val video = param

    override fun toString() : String{
        return "\n  $video"
    }

}
