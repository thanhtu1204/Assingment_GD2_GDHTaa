package vn.quanlyvatnuoi.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import vn.quanlyvatnuoi.Sqlite.SqliteHelper;
import vn.quanlyvatnuoi.model.Item;

import static vn.quanlyvatnuoi.common.Constants.ITEM_CHUNGLOAI;
import static vn.quanlyvatnuoi.common.Constants.ITEM_GT;
import static vn.quanlyvatnuoi.common.Constants.ITEM_ID;
import static vn.quanlyvatnuoi.common.Constants.ITEM_LOAITHUCAN;
import static vn.quanlyvatnuoi.common.Constants.ITEM_SLGT;
import static vn.quanlyvatnuoi.common.Constants.ITEM_SLLOAITHUCAN;
import static vn.quanlyvatnuoi.common.Constants.ITEM_SLTINHTRANGSK;
import static vn.quanlyvatnuoi.common.Constants.ITEM_TABLE;
import static vn.quanlyvatnuoi.common.Constants.ITEM_THOIGIANNUOI;
import static vn.quanlyvatnuoi.common.Constants.ITEM_TINHTRANGSK;

public class ItemDAO {
    private SQLiteDatabase sqLiteDatabase;
    private SqliteHelper sqliteHelper;

    public ItemDAO(SqliteHelper sqliteHelper) {
        this.sqliteHelper = sqliteHelper;
    }

    public List<Item> getALLitems() {
        sqLiteDatabase = sqliteHelper.getWritableDatabase();
        List<Item> items = new ArrayList<>();
        String GET_ALL_ITEM = " SELECT * FROM " + ITEM_TABLE;
        Cursor cursor = sqLiteDatabase.rawQuery(GET_ALL_ITEM, null);
        if (cursor != null & cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                int id = cursor.getInt(cursor.getColumnIndex(ITEM_ID));
                String chungloai = cursor.getString(cursor.getColumnIndex(ITEM_CHUNGLOAI));
                String tinhtrangsk = cursor.getString(cursor.getColumnIndex(ITEM_TINHTRANGSK));
                String sltinhtrangsk = cursor.getString(cursor.getColumnIndex(ITEM_SLTINHTRANGSK));
                String thoigiannuoi = cursor.getString(cursor.getColumnIndex(ITEM_THOIGIANNUOI));
                String loaithucan = cursor.getString(cursor.getColumnIndex(ITEM_LOAITHUCAN));
                String slloaithucan = cursor.getString(cursor.getColumnIndex(ITEM_SLLOAITHUCAN));
                String gioitinh = cursor.getString(cursor.getColumnIndex(ITEM_GT));
                String slgioitinh = cursor.getString(cursor.getColumnIndex(ITEM_SLGT));
                Item item = new Item();
                item.id = id;
                item.chungloai = chungloai;
                item.tinhtrangsk = tinhtrangsk;
                item.sltinhtrangsk = sltinhtrangsk;
                item.thoigiannuoi = thoigiannuoi;
                item.loaithucan = loaithucan;
                item.slloaithucan = slloaithucan;
                item.gioitinh = gioitinh;
                item.slgioitinh = slgioitinh;
                items.add(item);
                cursor.moveToNext();


            }
            cursor.close();
            sqLiteDatabase.close();
        }
        return items;

    }

    public Item getItembyId(int itemId) {
        Item item = null;
        sqLiteDatabase = sqliteHelper.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.query(ITEM_TABLE, new String[]{ITEM_CHUNGLOAI, ITEM_TINHTRANGSK, ITEM_SLTINHTRANGSK, ITEM_THOIGIANNUOI,
                        ITEM_LOAITHUCAN, ITEM_SLLOAITHUCAN, ITEM_GT, ITEM_SLGT}, ITEM_ID + "=?", new String[]{String.valueOf(itemId)}, null, null,
                null, null);
        if (cursor != null & cursor.getCount() > 0) {
            cursor.moveToFirst();
            int id = cursor.getInt(cursor.getColumnIndex(ITEM_ID));
            String chungloai = cursor.getString(cursor.getColumnIndex(ITEM_CHUNGLOAI));
            String tinhtrangsk = cursor.getString(cursor.getColumnIndex(ITEM_TINHTRANGSK));
            String sltinhtrangsk = cursor.getString(cursor.getColumnIndex(ITEM_SLTINHTRANGSK));
            String thoigiannuoi = cursor.getString(cursor.getColumnIndex(ITEM_THOIGIANNUOI));
            String loaithucan = cursor.getString(cursor.getColumnIndex(ITEM_LOAITHUCAN));
            String slloaithucan = cursor.getString(cursor.getColumnIndex(ITEM_SLLOAITHUCAN));
            String gioitinh = cursor.getString(cursor.getColumnIndex(ITEM_GT));
            String slgioitinh = cursor.getString(cursor.getColumnIndex(ITEM_SLGT));
            item = new Item();
            item.id = id;
            item.chungloai = chungloai;
            item.tinhtrangsk = tinhtrangsk;
            item.sltinhtrangsk = sltinhtrangsk;
            item.thoigiannuoi = thoigiannuoi;
            item.loaithucan = loaithucan;
            item.slloaithucan = slloaithucan;
            item.gioitinh = gioitinh;
            item.slgioitinh = slgioitinh;
            cursor.moveToNext();

        }
        cursor.close();
        sqLiteDatabase.close();
        return item;
    }

    public long updateItem(Item item) {
        sqLiteDatabase = sqliteHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ITEM_ID, item.id);
        contentValues.put(ITEM_CHUNGLOAI, item.chungloai);
        contentValues.put(ITEM_TINHTRANGSK, item.tinhtrangsk);
        contentValues.put(ITEM_SLTINHTRANGSK, item.sltinhtrangsk);
        contentValues.put(ITEM_THOIGIANNUOI, item.thoigiannuoi);
        contentValues.put(ITEM_LOAITHUCAN, item.loaithucan);
        contentValues.put(ITEM_SLLOAITHUCAN, item.slloaithucan);
        contentValues.put(ITEM_GT, item.gioitinh);
        contentValues.put(ITEM_SLGT, item.slgioitinh);
        long result = sqLiteDatabase.update(ITEM_TABLE, contentValues, ITEM_ID + "=?", new String[]{String.valueOf(item.id)});
        sqLiteDatabase.close();
        return result;

    }
    public long insertItem(Item item){
        sqLiteDatabase = sqliteHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ITEM_ID, item.id);
        contentValues.put(ITEM_CHUNGLOAI, item.chungloai);
        contentValues.put(ITEM_TINHTRANGSK, item.tinhtrangsk);
        contentValues.put(ITEM_SLTINHTRANGSK, item.sltinhtrangsk);
        contentValues.put(ITEM_THOIGIANNUOI, item.thoigiannuoi);
        contentValues.put(ITEM_LOAITHUCAN, item.loaithucan);
        contentValues.put(ITEM_SLLOAITHUCAN, item.slloaithucan);
        contentValues.put(ITEM_GT, item.gioitinh);
        contentValues.put(ITEM_SLGT, item.slgioitinh);
        long result = sqLiteDatabase.insert(ITEM_TABLE,null,contentValues);
        sqLiteDatabase.close();
        return result;
    }
    public long eleteItem(int id){
        sqLiteDatabase=sqliteHelper.getWritableDatabase();
        long result=sqLiteDatabase.delete(ITEM_TABLE,ITEM_ID+"=?",new String[]{String.valueOf(id)});
        sqLiteDatabase.close();
        return  result;
    }

}
