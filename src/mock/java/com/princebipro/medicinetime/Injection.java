package com.princebipro.medicinetime;

import android.content.Context;
import androidx.annotation.NonNull;

import com.princebipro.medicinetime.data.source.MedicineRepository;
import com.princebipro.medicinetime.data.source.local.MedicinesLocalDataSource;



public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
