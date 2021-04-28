package kupluk.smk.coding.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.fragment.app.Fragment
import com.google.android.material.card.MaterialCardView
import kupluk.smk.coding.*
import kupluk.smk.coding.activity.AlQuranActivity
import kupluk.smk.coding.activity.JadwalSholatActivity
import kupluk.smk.coding.activity.KalenderActivity
import kupluk.smk.coding.activity.TasbihActivity


class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val grid = view.findViewById(R.id.grid) as GridLayout
        val act = arrayOf(
            JadwalSholatActivity::class.java, AlQuranActivity::class.java, KalenderActivity::class.java,
            TasbihActivity::class.java)
        for (i in 0 until grid.childCount) {
            val container = grid.getChildAt(i) as MaterialCardView
            container.setOnClickListener {
                startActivity(Intent(view.context, act[i]))
            }
        }
    }
}