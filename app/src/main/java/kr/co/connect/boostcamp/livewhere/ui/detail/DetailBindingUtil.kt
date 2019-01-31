package kr.co.connect.boostcamp.livewhere.ui.detail

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.github.mikephil.charting.charts.BarChart
import kr.co.connect.boostcamp.livewhere.BuildConfig
import kr.co.connect.boostcamp.livewhere.model.HouseAvgPrice
import kr.co.connect.boostcamp.livewhere.util.BarChartUtil
import kr.co.connect.boostcamp.livewhere.util.No_barChart_text


@BindingAdapter("setBarChart")
fun setBarChart(barChart: BarChart, list: ArrayList<HouseAvgPrice>?) {
    if (list != null) {
        BarChartUtil.setChartData(barChart, list)
        BarChartUtil.showChart(barChart)
    }else{
        barChart.setNoDataText(No_barChart_text)
    }
}

@BindingAdapter("setDetailImage")
fun setDetailImage(imageView: AppCompatImageView, location: String?) {
    Glide.with(imageView.context)
        .load("https://maps.googleapis.com/maps/api/streetview?size=360x200&location=$location&key=${BuildConfig.GoogleApiKey}")
        .into(imageView)
}