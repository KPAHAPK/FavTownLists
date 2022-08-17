package com.example.favtownlists.data.data_source.crossref

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "custom_list_cross_ref", primaryKeys = ["cityId", "customCityListId"])
data class CustomListCrossRef(
    @ColumnInfo(name = "city_id")
    val cityId: Int?,
    @ColumnInfo(name = "city_list_info_id")
    val customCityListId: Int?,
)
