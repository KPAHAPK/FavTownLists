package com.example.favtownlists.data.data_source.mappers

import com.example.favtownlists.data.data_source.citylist.CityListInfoEntity
import com.example.favtownlists.repository.room.model.CityListInfoModel

fun CityListInfoModel.toCityListInfoEntity(): CityListInfoEntity{
    return CityListInfoEntity(
        name = name
    )
}
fun CityListInfoEntity.toCityListModel(): CityListInfoModel{
    return CityListInfoModel(
        name = name
    )
}