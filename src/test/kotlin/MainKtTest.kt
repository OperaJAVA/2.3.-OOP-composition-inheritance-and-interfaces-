import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun updateExisting() {
        val service = WallService

        val video1 = Video(
            123,
            12234,
            "title video1",
            "video dsc",
            10,
            null,
            null,
            232323,
            33232323,
            3,
            34,
            4,
            "player1",
            "platform",
            true,
            true,
            "accessKey",
            false,
            false,
            false,
            true,
            true,
            false,
            false,
            true,
            true,
            15,
            30,
            3242342,
            true,
            false,
            true,
            4,
            "type",
            34,
            "Status",
            true,
            false,
            10,
            VideoLikes(10, true),
            VideoReposts(45, 234234, 434, false)
        )

        val audio1 = Audio(
            10,
            12454353,
            "artist",
            "title",
            3234,
            "url",
            123,
            56,
            3,
            34234,
            4,
            9
        )

        val photo1 = Photo(
            4358394,
            324,
            234545435,
            54645,
            "text",
            3523552,
            arrayOf(Sizes("size1", "url", 12, 45)),
            145,
            345
        )

        val note1 = Note(
            34543543,
            334543543,
            "title",
            "text",
            23423525,
            42,
            5675,
            "Url",
            "privacyView",
            "privacyComment",
            true,
            "wiki"
        )

        val gift1 = Gift(
            33,
            "256",
            "96",
            "48"
        )

        val attachmentVideo1 = VideoAttachment(video1)
        val attachmentAudio1 = AudioAttachment(audio1)
        val attachmentPhoto1 = PhotoAttachment(photo1)
        val attachmentNote1 = NoteAttachment(note1)
        val attachmentGift1 = GiftAttachment(gift1)

        val post1 = Post(
            123,
            12345689,
            12345689,
            111111,
            1460041200,
            "Текст поста",
            12345689,
            6765,
            true,
            Comments(123, true, false, false, true),
            Copyright(23452784, "dfdfdsf", "Текст", "тип"),
            Likes(4873, true, true, true),
            Reposts(23, false),
            Views(21),
            "post", //post, copy, reply, postpone, suggest
            null,
            arrayOf(attachmentAudio1, attachmentVideo1),
            null,
            12786,
            null,
            true,
            false,
            true,
            false,
            false,
            true,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )

        val post2 = Post(
            234,
            12345665,
            12345665,
            111111,
            1460041200,
            "Текст поста",
            12345689,
            6765,
            true,
            Comments(123, true, false, false, true),
            Copyright(23452784, "dfdfdsf", "Текст", "тип"),
            Likes(4873, true, true, true),
            Reposts(23, false),
            Views(21),
            "post", //post, copy, reply, postpone, suggest.
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            122,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )

        val post3 = Post(
            3,
            12345670,
            12345555,
            111111,
            1460041200,
            "Текст поста",
            12345689,
            6765,
            false,
            Comments(123, true, false, false, true),
            Copyright(23452784, "dfdfdsf", "Текст", "тип"),
            Likes(4873, true, true, true),
            Reposts(23, false),
            Views(21),
            "post", //post, copy, reply, postpone, suggest.
            null,
            arrayOf(attachmentNote1, attachmentPhoto1),
            null,
            122,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )

        val update = Post(
            2,
            99999999,
            99999999,
            99999999,
            1460041200,
            "Update",
            99999999,
            99999999,
            true,
            Comments(99999999, true, false, false, true),
            Copyright(99999999, "Update", "Update", "Update"),
            Likes(99999999, true, true, true),
            Reposts(99999999, false),
            Views(99999999),
            "post", //post, copy, reply, postpone, suggest.
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            122,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )
        service.add(post1)
        service.add(post2)
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        val service = WallService

        val video1 = Video(
            123,
            12234,
            "title video1",
            "video dsc",
            10,
            null,
            null,
            232323,
            33232323,
            3,
            34,
            4,
            "player1",
            "platform",
            true,
            true,
            "accessKey",
            false,
            false,
            false,
            true,
            true,
            false,
            false,
            true,
            true,
            15,
            30,
            3242342,
            true,
            false,
            true,
            4,
            "type",
            34,
            "Status",
            true,
            false,
            10,
            VideoLikes(10, true),
            VideoReposts(45, 234234, 434, false)
        )

        val audio1 = Audio(
            10,
            12454353,
            "artist",
            "title",
            3234,
            "url",
            123,
            56,
            3,
            34234,
            4,
            9
        )

        val photo1 = Photo(
            4358394,
            324,
            234545435,
            54645,
            "text",
            3523552,
            arrayOf(Sizes("size1", "url", 12, 45)),
            145,
            345
        )

        val note1 = Note(
            34543543,
            334543543,
            "title",
            "text",
            23423525,
            42,
            5675,
            "Url",
            "privacyView",
            "privacyComment",
            true,
            "wiki"
        )

        val gift1 = Gift(
            33,
            "256",
            "96",
            "48"
        )

        val attachmentVideo1 = VideoAttachment(video1)
        val attachmentAudio1 = AudioAttachment(audio1)
        val attachmentPhoto1 = PhotoAttachment(photo1)
        val attachmentNote1 = NoteAttachment(note1)
        val attachmentGift1 = GiftAttachment(gift1)

        val post1 = Post(
            123,
            12345689,
            12345689,
            111111,
            1460041200,
            "Текст поста",
            12345689,
            6765,
            true,
            Comments(123, true, false, false, true),
            Copyright(23452784, "dfdfdsf", "Текст", "тип"),
            Likes(4873, true, true, true),
            Reposts(23, false),
            Views(21),
            "post", //post, copy, reply, postpone, suggest
            null,
            arrayOf(attachmentAudio1, attachmentVideo1),
            null,
            12786,
            null,
            true,
            false,
            true,
            false,
            false,
            true,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )

        val post2 = Post(
            234,
            12345665,
            12345665,
            111111,
            1460041200,
            "Текст поста",
            12345689,
            6765,
            true,
            Comments(123, true, false, false, true),
            Copyright(23452784, "dfdfdsf", "Текст", "тип"),
            Likes(4873, true, true, true),
            Reposts(23, false),
            Views(21),
            "post", //post, copy, reply, postpone, suggest.
            null,
            arrayOf(attachmentNote1, attachmentGift1, attachmentPhoto1),
            null,
            122,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )

        val post3 = Post(
            3,
            12345670,
            12345555,
            111111,
            1460041200,
            "Текст поста",
            12345689,
            6765,
            false,
            Comments(123, true, false, false, true),
            Copyright(23452784, "dfdfdsf", "Текст", "тип"),
            Likes(4873, true, true, true),
            Reposts(23, false),
            Views(21),
            "post", //post, copy, reply, postpone, suggest.
            null,
            arrayOf(attachmentNote1, attachmentPhoto1),
            null,
            122,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )
        val update = Post(
            256,
            99999999,
            99999999,
            99999999,
            1460041200,
            "Update",
            99999999,
            99999999,
            true,
            Comments(99999999, true, false, false, true),
            Copyright(99999999, "Update", "Update", "Update"),
            Likes(99999999, true, true, true),
            Reposts(99999999, false),
            Views(99999999),
            "post", //post, copy, reply, postpone, suggest.
            null,
            arrayOf(attachmentNote1, attachmentPhoto1),
            null,
            122,
            null,
            true,
            true,
            false,
            true,
            false,
            false,
            Donut(true, 223, "placeholder", true, "all"),
            1
        )

        service.add(post1)
        service.add(post2)
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun add() {
        val service = WallService

        val video1 = Video(
            123,
            12234,
            "title video1",
            "video dsc",
            10,
            null,
            null,
            232323,
            33232323,
            3,
            34,
            4,
            "player1",
            "platform",
            true,
            true,
            "accessKey",
            false,
            false,
            false,
            true,
            true,
            false,
            false,
            true,
            true,
            15,
            30,
            3242342,
            true,
            false,
            true,
            4,
            "type",
            34,
            "Status",
            true,
            false,
            10,
            VideoLikes(10, true),
            VideoReposts(45, 234234, 434, false)
        )

        val audio1 = Audio(
            10,
            12454353,
            "artist",
            "title",
            3234,
            "url",
            123,
            56,
            3,
            34234,
            4,
            9
        )

        val photo1 = Photo(
            4358394,
            324,
            234545435,
            54645,
            "text",
            3523552,
            arrayOf(Sizes("size1", "url", 12, 45)),
            145,
            345
        )

        val note1 = Note(
            34543543,
            334543543,
            "title",
            "text",
            23423525,
            42,
            5675,
            "Url",
            "privacyView",
            "privacyComment",
            true,
            "wiki"
        )

        val gift1 = Gift(
            33,
            "256",
            "96",
            "48"
        )

        val attachmentVideo1 = VideoAttachment(video1)
        val attachmentAudio1 = AudioAttachment(audio1)
        val attachmentPhoto1 = PhotoAttachment(photo1)
        val attachmentNote1 = NoteAttachment(note1)
        val attachmentGift1 = GiftAttachment(gift1)

        val postNew = service.add(
            Post(
                123,
                12345689,
                12345689,
                111111,
                1460041200,
                "Текст поста",
                12345689,
                6765,
                true,
                Comments(123, true, false, false, true),
                Copyright(23452784, "dfdfdsf", "Текст", "тип"),
                Likes(4873, true, true, true),
                Reposts(23, false),
                Views(21),
                "post", //post, copy, reply, postpone, suggest
                null,
                arrayOf(attachmentAudio1, attachmentVideo1),
                null,
                12786,
                null,
                true,
                false,
                true,
                false,
                false,
                true,
                Donut(true, 223, "placeholder", true, "all"),
                1
            )
        )
        assertTrue(postNew.id > 0)
    }
}