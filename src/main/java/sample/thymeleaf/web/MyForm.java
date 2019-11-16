package sample.thymeleaf.web;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyForm {
    private String value;
    private boolean checked;

    // テキスト
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // チェックボックス
    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    // ラジオボタン
    private String selectedValue = "piyo";

    public Map<String, String> radioButtons() {
        Map<String, String> radioButtons = new LinkedHashMap<>();
        radioButtons.put("hoge", "HOGE");
        radioButtons.put("fuga", "FUGA");
        radioButtons.put("piyo", "PIYO");

        return radioButtons;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    // ドロップダウンリスト
    
}