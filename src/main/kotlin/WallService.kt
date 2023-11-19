object WallService {
    var posts: Array<Post> = emptyArray()
    var nextId: Long = 1

    fun add(post: Post) : Post {
        val postNew = post.copy(id = nextId)
        posts += postNew
        nextId += 1
        return posts.last()
    }

    fun update(postFind: Post) : Boolean {
        for ((index, post) in posts.withIndex()){
            if (post.id == postFind.id) {
                posts[index] = postFind.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }

    fun print(){
        for (post in posts){
            println(post)
        }
    }
}