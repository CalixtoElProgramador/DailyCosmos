package com.listocalixto.dailycosmos.data.local

import com.listocalixto.dailycosmos.data.model.APOD
import com.listocalixto.dailycosmos.data.model.APODEntity
import com.listocalixto.dailycosmos.data.model.toAPODList
import kotlinx.coroutines.flow.Flow

class LocalAPODDataSource(private val apodDao: APODDao) {

    suspend fun getResults(): List<APOD> {
        return apodDao.getAllAPODs().toAPODList()
    }

    suspend fun saveAPOD(apodEntity: APODEntity) {
        apodDao.saveAPOD(apodEntity)
    }

    suspend fun updateFavorite(apodEntity: APODEntity) {
        apodDao.updateFavorite(apodEntity)
    }

    /*fun getAPOD(date: String): Flow<APOD> = apodDao.getAPODDistinctUntilChanged(date)*/

}