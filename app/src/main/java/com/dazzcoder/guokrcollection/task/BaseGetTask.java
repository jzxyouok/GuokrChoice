package com.dazzcoder.guokrcollection.task;

import android.os.AsyncTask;

import com.dazzcoder.guokrcollection.bean.Article;
import com.dazzcoder.guokrcollection.support.http.HttpParams;

import java.util.List;

/**
 * Created by Dazz on 2016/4/4.
 */
public abstract class BaseGetTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result>{

    protected boolean isSucceed = true;

    protected int actionId;

    public BaseGetTask(int actionId) {
        this.actionId = actionId;
    }


}
