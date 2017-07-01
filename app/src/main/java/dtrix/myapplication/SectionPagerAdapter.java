package dtrix.myapplication;

/**
 * Created by Soumya on 25-06-2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    static String[] arr = {"one","two","three","four","five","six"};
    static String[] arr2 = {"one","two","three","four","five","six","7","8"};

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return new TabFragment();
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return arr.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return arr[position];
    }
}