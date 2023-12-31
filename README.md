# Выполнила Прыгара О.С
* 19.11.2023

# Домашнее задание к занятию «2.3. ООП: Композиция, наследование и интерфейсы»

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

**Важно**: ознакомьтесь со ссылками на главной странице [репозитория с домашними заданиями](../README.md).

Если у вас что-то не получилось, то оформляйте Issue [по установленным правилам](../report-requirements.md).

Нужно сделать все задачи в **одном** репозитории.

## Как сдавать задачи

1. Создайте на вашем компьютере Gradle-проект.
1. Инициализируйте в нём пустой Git-репозиторий.
1. Добавьте в него готовый файл [.gitignore](../.gitignore).
1. Добавьте в этот же каталог остальные необходимые файлы.
1. Сделайте необходимые коммиты.
1. Создайте публичный репозиторий на GitHub и свяжите свой локальный репозиторий с удалённым.
1. Сделайте пуш и удостоверьтесь, что ваш код появился на GitHub.
1. Ссылку на ваш проект отправьте из личного кабинета на сайте [netology.ru](https://netology.ru).
1. Необязательные задачи можно не сдавать — это не повлияет на получение зачёта. В этом ДЗ все задачи обязательные.

## Задача №1 - Посты (без Attachments)

Мы с вами изучили `Nullable`, поэтому пришло время закрыть вопросы с постами: привыкайте к тому, что ваш код никуда не исчезает, и вам предстоит поддерживать то, что вы сами же когда-то написали (старая шутка "да кто вообще это писал?"). Поэтому мы в том числе будем отрабатывать и этот навык.

Доработайте первую задачу из предыдущей лекции так, чтобы ваша система отображала все поля объекта (кроме `attachments`), описанного в документации.

Напоминаем, что если у вас по каким-то причинам не доступен Vk, вы всегда можете воспользоваться сохранённой версией из каталога [assets](assets)

Что мы хотим получить:
1. Data класс `Post`.
1. Внутри `Post` могут быть `Nullable` свойства.
1. `WallService`, который внутри себя хранит посты в массиве.

Итог: у вас должен быть репозиторий на GitHub, в котором расположен ваш Gradle-проект. Автотесты также должны храниться в репозитории.

Вы можете оформить это как Pull Request к предыдущему проекту (присылайте в личном кабинете ссылку на PR).

**Важно**: после ваших обновлений, функциональность `WallService` должна оставаться работоспособной (т.е. автотесты должны проходить).

## Задача №2 - Attachments

Надеемся, что с постами было не так уж и сложно. А вот с [`attachments`](assets/attachments.pdf) будет сложнее.

Почему? Потому что у вас в массиве будут храниться совершенно разные объекты (на самом деле не совсем так, но сейчас разберёмся).

Сам Vk их хранит вот так:

```json
{
    "attachments": [
      {
        "type": "photo",
        "photo": {
            "id": 1,
            "album_id": 1,
            "owner_id": 1,
            "user_id": 1
        }
      }, {
        "type": "video",
        "video": {
            "id": 1,
            "album_id": 1,
            "owner_id": 1,
            "user_id": 1
        }
      }
    ]
}
```

Что это значит? Это значит, что у вас есть объект типа `Attachment`, в котором есть поле `type`, а вот какое второе поле у него есть - мы не знаем (оно определяется на базе значения поля `type`).

Соответственно, у вас два варианта:
1. Сделать `Attachment` интерфейсом.
1. Сделать `Attachment` абстрактным классом.

Тогда всё сходится и вы можете создать массив типа `Attachment` и через Smart Casts работать уже работать с конкретным полем.

Собственно, это вам и необходимо сделать.

Поскольку типов вложений очень много, вам достаточно выбрать для реализации любые 5.

<details>
<summary>Подсказка</summary>

`Audio`, `Video` (то, что вложено в конкретные реализации `Attachment` придётся тоже оформить в виде отдельных классов). Т.е. у вас будет `AudioAttachment` и `Audio`.
</details>

Вы можете оформить это как Pull Request к задаче №1 (присылайте ссылку в личном кабинете на PR).

**Важно**: после ваших обновлений, функциональность `WallService` должна оставаться работоспособной (т.е. автотесты должны проходить).

## Задача №3 - Sealed классы*

**Важно**: это не обязательная задача. Её выполнение не влияет на получение зачёта по ДЗ.

Одной из возможностей Kotlin для решения предыдущей задачи являются [Sealed ("запечатанные") классы](https://kotlinlang.org/docs/reference/sealed-classes.html).

Что это значит? Это значит, что вы можете определить фиксированную иерархию типов (ведь количество типов вложений у вас фиксировано).

Тогда в выражениях типа `when` вам не придётся писать `else`.

Нужно почитать [документацию](https://kotlinlang.org/docs/reference/sealed-classes.html) и сделать Pull Request с реализацией на базе Sealed классов (вы можете подглядеть подсказку).

<details>
<summary>Подсказка</summary>

Не забывайте, что у всех наследников есть общее поле `type`. Для Sealed классов возможна следующая реализация:
```kotlin
sealed class Attachment(val type: String)

data class VideoAttachment(val video: Video) : Attachment("video")

fun main() {
    val attachment: Attachment = VideoAttachment("stuff")
    println(attachment.type)
}
```
</details>

Вы можете оформить это как Pull Request к задаче №1 (присылайте ссылку в личном кабинете на PR).

**Важно**: после ваших обновлений, функциональность `WallService` должна оставаться работоспособной (т.е. автотесты должны проходить).
