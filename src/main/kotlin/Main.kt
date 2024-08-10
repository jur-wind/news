package nl.jurwind

import com.thedeanda.lorem.Lorem
import com.thedeanda.lorem.LoremIpsum
import java.io.FileOutputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class NewsItem(
    val title: String,
    val content: String,
    val timestamp: LocalDateTime,
)

fun main() {
    // 1. Create news
    val lorem: Lorem = LoremIpsum.getInstance()
    val newsItem = NewsItem(
        lorem.getTitle(3, 5),
        lorem.getHtmlParagraphs(5, 8),
        LocalDateTime.now()
    )

    // 2. Create directories if they don't exist
    val fileFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val dirFormatter = DateTimeFormatter.ofPattern("yyyy/MM")
    val file = "./docs/${newsItem.timestamp.format(dirFormatter)}/${newsItem.timestamp.format(fileFormatter)}.md"

    val path = Paths.get(file)
    if (!Files.exists(path.parent)) {
        Files.createDirectories(path.parent)
    }

    // 3. Write news to day file
    FileOutputStream(file).bufferedWriter().use { writer ->
        writer.append("## ${newsItem.title}")
        writer.newLine()
        writer.append(newsItem.content)
    }
}