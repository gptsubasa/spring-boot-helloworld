package sample.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

import java.util.Arrays;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        model.addAttribute("modelValue", "Model Value!!");

        // SpEL式
        model.addAttribute("hoge", new Hoge());

        // Mapの参照
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello World!!");
        model.addAttribute("map", map);

        // Listの参照
        model.addAttribute("list", Arrays.asList(1, 2, 3));

        // クエリパラメータ設定
        model.addAttribute("paramValue", "PARAM VALUE");

        // 条件による表示・非表示の切り替え
        model.addAttribute("flag", true);

        // 真・偽と評価される値
        model.addAttribute("booleanTrue", true);
        model.addAttribute("booleanFalse", false);
        model.addAttribute("numericZero", 0);
        model.addAttribute("numericOne", 1);
        model.addAttribute("charZero", '0');
        model.addAttribute("stringEmpty", "");
        model.addAttribute("stringZero", "0");
        model.addAttribute("stringOff", "off");
        model.addAttribute("stringNo", "no");
        model.addAttribute("stringFalse", "false");
        model.addAttribute("anyObject", new Object());
        model.addAttribute("nullValue", null);

        //繰り返し処理
        model.addAttribute("list", Arrays.asList("hoge", "fuga", "piyo"));

        // Map の繰り返し
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("hoge", "HOGE");
        map2.put("fuga", "FUGA");
        map2.put("piyo", "PIYO");
        model.addAttribute("map2", map2);

        return "hello";
    }

    public static class Hoge {
        public int publicField = 1;
        public int publicMethod() {return 2;}
        public int getPublicValue() {return 3;}

        // オブジェクトの選択
        public String name = "hogeee";
        public String value = "HOGEEE";
    }
}