package com.example.myharmony.slice;

import com.example.myharmony.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;


public class TestAbilitySlice extends AbilitySlice {
     Text text;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_test);

        text=(Text)findComponentById(ResourceTable.Id_text1);
// 跑马灯效果
        text.setTruncationMode(Text.TruncationMode.AUTO_SCROLLING);
// 始终处于自动滚动状态
        text.setAutoScrollingCount(Text.AUTO_SCROLLING_FOREVER);
// 启动跑马灯效果
        text.startAutoScrolling();
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
