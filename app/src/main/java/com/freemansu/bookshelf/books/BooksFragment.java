package com.freemansu.bookshelf.books;
/*
 * Copyright (C) 2016 Su Yu. All Rights Reserved.
 *
 * @author Su Yu <yusu.work@gmail.com, www.freemansu.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Fragment;

import com.freemansu.bookshelf.data.Book;

import java.util.List;

public class BooksFragment extends Fragment implements BooksContract.View {
    @Override
    public void showBooks(List<Book> books) {

    }

    @Override
    public void setPresenter(BooksContract.Presenter presenter) {

    }
}
