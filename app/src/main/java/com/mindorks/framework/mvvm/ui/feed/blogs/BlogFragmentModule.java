/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.mindorks.framework.mvvm.ui.feed.blogs;

import android.support.v7.widget.LinearLayoutManager;

import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.data.model.api.BlogResponse;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public class BlogFragmentModule {

    @Provides
    BlogViewModel provideBlogViewModel(DataManager dataManager,
                                       SchedulerProvider schedulerProvider) {
        return new BlogViewModel(dataManager, schedulerProvider);
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(BlogFragment fragment) {
        return new LinearLayoutManager(fragment.getActivity());
    }

}
