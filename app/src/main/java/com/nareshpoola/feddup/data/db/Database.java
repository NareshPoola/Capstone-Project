package com.nareshpoola.feddup.data.db;

import com.nareshpoola.feddup.data.db.schema.DraftColumns;
import com.nareshpoola.feddup.data.db.schema.PostCacheColumns;
import com.nareshpoola.feddup.data.db.schema.PostColumns;

import net.simonvt.schematic.annotation.Table;

@net.simonvt.schematic.annotation.Database(
        version = Database.VERSION,
        packageName = "com.nareshpoola.feddup.data.db.provider"
)
class Database {

    static final int VERSION = 1;

    @Table(DraftColumns.class)
    static final String Drafts = "Drafts";

    @Table(PostColumns.class)
    static final String Favorites = "Favorites";

    @Table(PostColumns.class)
    static final String Downvotes = "Downvotes";

    @Table(PostCacheColumns.class)
    static final String PostCache = "PostCache";

    private Database() {
    }
}
