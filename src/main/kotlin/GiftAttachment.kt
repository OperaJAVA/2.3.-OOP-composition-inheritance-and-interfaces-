class GiftAttachment(param : Gift) : Attachment {
    override val type: String = "gift"
    val gift = param

    override fun toString() : String{
        return "\n  $gift"
    }
}
