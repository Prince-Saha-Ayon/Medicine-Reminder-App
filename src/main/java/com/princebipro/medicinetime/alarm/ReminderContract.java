package com.princebipro.medicinetime.alarm;

import com.princebipro.medicinetime.BasePresenter;
import com.princebipro.medicinetime.BaseView;
import com.princebipro.medicinetime.data.source.History;
import com.princebipro.medicinetime.data.source.MedicineAlarm;

/**
 * Created by gautam on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
