package study.onefolder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    lateinit var listRecyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listLists = listOf("Moskow","Vologda","Barnaul","Tomsk","Gorno-Altaysk")
        for (list in listLists){println(list)
        }


        listRecyclerView=findViewById(R.id.list_recycler_view)
        listRecyclerView.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        listRecyclerView.adapter = ListAdapter(listLists)
        listRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
    }
}
