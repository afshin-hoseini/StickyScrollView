package ir.afshin.stickyscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ir.afshin.stickyscrollviewlib.StickyScrollView;

public class TestActivity extends AppCompatActivity {

    RecyclerView rv_items = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);
        rv_items = (RecyclerView) findViewById(R.id.rv_items);
        rv_items.setLayoutManager(new LinearLayoutManager(this));
        rv_items.setAdapter(new ItemsAdapter());
    }


    private class ItemViewHolder extends RecyclerView.ViewHolder {


        View row = null;
        TextView txt = null;

        public ItemViewHolder(View itemView) {
            super(itemView);

            this.row = itemView;
            this.txt = (TextView) row.findViewById(R.id.txt);
        }

        public void setText(String text) {

            this.txt.setText(text);
        }
    }

    private class ItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {

        @Override
        public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View row = LayoutInflater.from(TestActivity.this).inflate(R.layout.row, parent, false);
            ItemViewHolder itemViewHolder = new ItemViewHolder(row);

            return itemViewHolder;
        }

        @Override
        public void onBindViewHolder(ItemViewHolder holder, int position) {

            holder.setText("Item no: " + position);
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

}
