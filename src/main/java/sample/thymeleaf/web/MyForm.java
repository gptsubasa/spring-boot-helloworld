package sample.thymeleaf.web;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

// 独自バリデータ
import sample.thymeleaf.validation.MyValidation;

@MyValidation
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

    // 動的追加削除
    // private List<Row> rows = new ArrayList<>();

    // public void appendRow() {
    //     this.rows.add(new Row());
    // }

    // public void removeRow(int index) {
    //     this.rows.remove(index);
    // }

    // public List<Row> getRows() {
    //     return rows;
    // }

    // public void setRows(List<Row> rows) {
    //     this.rows = rows;
    // }

    // public static class Row {
    //     private String value;

    //     public String getValue() {
    //         return value;
    //     }

    //     public void setValue(String value) {
    //         this.value = value;
    //     }
    // }

    // バリデーション
    @Size(min=3)
    private String text;
    @Min(100)
    private Integer number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}