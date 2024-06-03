package com.example.vikasojha.quizbee;

import android.app.Application;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    @Test
    public void testApplicationNotNull() {
        Application application = ApplicationProvider.getApplicationContext();
        assertNotNull(application);
    }
}
