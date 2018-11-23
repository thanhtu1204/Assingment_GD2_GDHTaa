package vn.quanlyvatnuoi.common;

public class Constants {
    public final static boolean isDEBUG = true;
    public final static String ITEM_ID = "id";
    public final static String ITEM_CHUNGLOAI = "chung loai";
    public final static String ITEM_TINHTRANGSK = "tinh trang suc khoe";
    public final static String ITEM_SLTINHTRANGSK = "so luong / tong dan";
    public final static String ITEM_THOIGIANNUOI = "thoi gian nuoi";
    public final static String ITEM_LOAITHUCAN = "loai thuc an";
    public final static String ITEM_SLLOAITHUCAN = "so luong thuc an";
    public final static String ITEM_GT = "gioi tinh";
    public final static String ITEM_SLGT = "thoi gian nuoi";
    public final static String ITEM_TABLE = "item_table";
    public final static String CREATE_ITEM_TABLE = "CREATE TABLE" + ITEM_TABLE + "(" +
            "" + ITEM_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
            "" + ITEM_CHUNGLOAI + "TEXT" +
            "" + ITEM_TINHTRANGSK + "TEXT" +
            "" + ITEM_SLTINHTRANGSK + "TEXT" +
            "" + ITEM_THOIGIANNUOI + "TEXT" +
            "" + ITEM_LOAITHUCAN + "TEXT" +
            "" + ITEM_SLLOAITHUCAN + "TEXT" +
            "" + ITEM_GT + "TEXT" +
            "" + ITEM_SLGT + "TEXT" + ")";

}
