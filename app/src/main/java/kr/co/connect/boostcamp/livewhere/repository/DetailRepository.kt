package kr.co.connect.boostcamp.livewhere.repository

import io.reactivex.Single
import kr.co.connect.boostcamp.livewhere.api.Api
import kr.co.connect.boostcamp.livewhere.model.Review
import retrofit2.Response

interface DetailRepository {

    fun getDetail(address:String): Single<Response<List<Any>>>

}

class DetailRepositoryImpl(private val api : Api) : DetailRepository{

    override fun getDetail(address: String): Single<Response<List<Any>>> {
        return api.getHouseDetail(address)
    }

}