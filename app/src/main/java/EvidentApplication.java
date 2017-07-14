import android.app.Application;

import com.evidentid.R;
import com.evidentid.di.components.CoreComponent;
import com.evidentid.di.components.DaggerCoreComponent;
import com.evidentid.di.modules.ApiModule;
import com.evidentid.utils.Constants;

/**
 * Created by patel on 7/13/2017.
 */

public class EvidentApplication extends Application {

    private CoreComponent mCoreComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        String baseUrl = getResources().getString(R.string.base_url)
                + getResources().getString(R.string.api_key)
                + Constants.SEPARATOR;

        mCoreComponent = DaggerCoreComponent.builder()
                .apiModule(new ApiModule(baseUrl))
                .build();
    }

    public CoreComponent getCoreComponent() {
        return mCoreComponent;
    }
}
