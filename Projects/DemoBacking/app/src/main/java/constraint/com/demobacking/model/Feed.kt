package constraint.com.demobacking.model

import java.io.Serializable

data class Feed(
    val noOfLikes:Int
): Serializable{

    companion object{
        val EMPTY = Feed(
            noOfLikes = 99
        )
    }
}