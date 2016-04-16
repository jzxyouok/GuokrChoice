package com.dazzcoder.guokrcollection.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.dazzcoder.guokrcollection.R;
import com.dazzcoder.guokrcollection.support.Constants;

/**
 * Created by Dazz on 2016/4/7.
 */
public class ArticleFragment extends BaseLazyFragment {

    WebView webView;
    int id;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        id = getArguments().getInt("id");

    }

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_article, container, false);
        webView = (WebView) view.findViewById(R.id.articleView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        return view;
    }

    @Override
    protected void initData() {
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        webView.loadUrl(Constants.Url.ARTICLE_LINK + id);
    }
}
