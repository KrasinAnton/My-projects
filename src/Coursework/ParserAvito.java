package Coursework;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParserAvito {
 /*   public static void main(String[] args) throws IOException {
        String url = "https://www.avito.ru/";
        Document document = Jsoup.connect(url).get();

        // Получаем заголовок страницы
        String title = document.title();
        System.out.println("Title: " + title);

        // Получаем все ссылки на странице
        Elements links = document.select("a[href]");
        for (Element link : links) {
            System.out.println("Link: " + link.attr("href"));
        }

        // Получаем все изображения на странице
        Elements images = document.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
        for (Element image : images) {
            System.out.println("Image: " + image.attr("src"));
        }

        // Получаем все объявления на странице
        Elements items = document.select(".item");
        for (Element item : items) {
            String titleItem = item.select(".item-title").text();
            String priceItem = item.select(".price").text();
            System.out.println("Title item: " + titleItem);
            System.out.println("Price item: " + priceItem);
        }
    }*/
 public static void main(String[] args) throws IOException {
     String url = "https://www.avito.ru/sverdlovskaya_oblast?q=%D0%B4%D0%B2%D1%83%D1%85%D0%BF%D0%BE%D0%B4%D0%B2%D0%B5%D1%81";
     Document document = Jsoup.connect(url).get();

     // Получаем все объявления на странице
     Elements items = document.select(".item");
     for (Element item : items) {
         // Получаем заголовок объявления
         String titleItem = item.select(".item-title").text();
         // Проверяем, содержится ли в заголовке слово "двухподвес"
         if (titleItem.toLowerCase().contains("двухподвес")) {
             // Получаем ссылку на объявление
             String linkItem = item.select(".item-title").attr("href");
             // Получаем цену объявления
             String priceItem = item.select(".price").text();
             // Выводим результаты поиска
             System.out.println("Title item: " + titleItem);
             System.out.println("Link item: " + linkItem);
             System.out.println("Price item: " + priceItem);
         }
     }
 }

}

