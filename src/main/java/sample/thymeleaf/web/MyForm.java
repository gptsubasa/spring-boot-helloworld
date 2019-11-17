package sample.thymeleaf.web;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

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
    private List<Row> rows = new ArrayList<>();

    public void appendRow() {
        this.rows.add(new Row());
    }

    public void removeRow(int index) {
        this.rows.remove(index);
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public static class Row {
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}