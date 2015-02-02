package com.patryklenza.androidespressoidlingresource;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true,
        injects = ThirdActivity.class
)
public class RestServicesModule {

    @Provides
    public BackendContract provideLogoutService() {
        return new BackendService();
    }
}