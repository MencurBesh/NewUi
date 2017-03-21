package org.catroid.catrobat.newui;


import android.util.Log;

import org.catroid.catrobat.newui.data.BaseListItem;

import java.util.List;

public final class ActionModeListener {

    private static final String NUM_ITEMS = "selected item cnt: ";
    private static final String DELETE = "item to delete: ";
    private static final String COPY = "item to copy: ";
    private static final String RENAME = "item to rename: ";
    private static final String BACKPACK = "item to pack: ";

    public void deleteItems(List<? extends BaseListItem> selectedItems) {
        Log.i(NUM_ITEMS, Integer.toString(selectedItems.size()));
        for (BaseListItem listItem : selectedItems) {
            Log.i(DELETE, listItem.getName());
        }
    }

    public void copyItems(List<? extends BaseListItem> selectedItems) {
        Log.i(NUM_ITEMS, Integer.toString(selectedItems.size()));
        for (BaseListItem listItem : selectedItems) {
            Log.i(COPY, listItem.getName());
        }
    }

    public void renameItem(BaseListItem selectedItem) {
        Log.i(RENAME, selectedItem.getName());
    }

    public void packItems(List<? extends BaseListItem> selectedItems) {
        Log.i(NUM_ITEMS, Integer.toString(selectedItems.size()));
        for (BaseListItem listItem : selectedItems) {
            Log.i(BACKPACK, listItem.getName());
        }
    }
}