package org.dimigo.crawling;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {
    public static void main(String[] args) {
        // 네이버 웹툰 실시간 인기 순위
        try {
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            Elements elements = doc.select("[id=realTimeRankFavorite] > li a");
            List<String> list = elements.eachText();
            for (String title: list) {
                System.out.println(title);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
