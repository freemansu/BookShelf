package com.freemansu.bookshelf.data;
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

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Objects;
import java.util.UUID;

public final class Book {

    @NonNull
    private final String mId;

    @NonNull
    private final String mTitle;

    @NonNull
    private final String mSubTitle;

    @Nullable
    private final String mDescription;

    public Book(@NonNull String id, @NonNull String title, @NonNull String subTitle, String description) {
        this.mId = id;
        this.mTitle = title;
        this.mSubTitle = subTitle;
        this.mDescription = description;
    }

    public Book(@NonNull String title, @NonNull String subTitle, String description) {
        this(UUID.randomUUID().toString(), title, subTitle, description);
    }

    @NonNull
    public String getmId() {
        return mId;
    }

    @NonNull
    public String getmTitle() {
        return mTitle;
    }

    @NonNull
    public String getmSubTitle() {
        return mSubTitle;
    }

    @Nullable
    public String getmDescription() {
        return mDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!mId.equals(book.mId)) return false;
        if (!mTitle.equals(book.mTitle)) return false;
        if (!mSubTitle.equals(book.mSubTitle)) return false;
        return mDescription != null ? mDescription.equals(book.mDescription) : book.mDescription == null;

    }

    @Override
    public int hashCode() {
        return Objects.hash(mId, mTitle, mDescription);
    }

    @Override
    public String toString() {
        return "Book{" +
                "mId='" + mId + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mSubTitle='" + mSubTitle + '\'' +
                ", mDescription='" + mDescription + '\'' +
                '}';
    }
}