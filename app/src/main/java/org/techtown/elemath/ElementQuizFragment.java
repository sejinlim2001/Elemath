package org.techtown.elemath;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class ElementQuizFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_element_quiz, container, false);

        boolean correctproblem1 = false;
        boolean correctproblem2 = false;
        boolean correctproblem3 = false;
        boolean correctproblem4 = false;
        boolean correctproblem5 = false;
        boolean correctproblem6 = false;
        boolean correctproblem7 = false;
        boolean correctproblem8 = false;
        boolean correctproblem9 = false;
        boolean correctproblem10 = false;
        boolean correctproblem11 = false;
        boolean correctproblem12 = false;
        boolean correctproblem13 = false;
        boolean correctproblem14 = false;
        boolean correctproblem15 = false;
        boolean correctproblem16 = false;
        boolean correctproblem17 = false;
        boolean correctproblem18 = false;
        boolean correctproblem19 = false;
        boolean correctproblem20 = false;

        SharedPreferences pref2 = getActivity().getSharedPreferences("pref2", Activity.MODE_PRIVATE);

        if (pref2 != null) {
            correctproblem1 = pref2.getBoolean("Problem1", false);
            correctproblem2 = pref2.getBoolean("Problem2", false);
            correctproblem3 = pref2.getBoolean("Problem3", false);
            correctproblem4 = pref2.getBoolean("Problem4", false);
            correctproblem5 = pref2.getBoolean("Problem5", false);
            correctproblem6 = pref2.getBoolean("Problem6", false);
            correctproblem7 = pref2.getBoolean("Problem7", false);
            correctproblem8 = pref2.getBoolean("Problem8", false);
            correctproblem9 = pref2.getBoolean("Problem9", false);
            correctproblem10 = pref2.getBoolean("Problem10", false);
            correctproblem11 = pref2.getBoolean("Problem11", false);
            correctproblem12 = pref2.getBoolean("Problem12", false);
            correctproblem13 = pref2.getBoolean("Problem13", false);
            correctproblem14 = pref2.getBoolean("Problem14", false);
            correctproblem15 = pref2.getBoolean("Problem15", false);
            correctproblem16 = pref2.getBoolean("Problem16", false);
            correctproblem17 = pref2.getBoolean("Problem17", false);
            correctproblem18 = pref2.getBoolean("Problem18", false);
            correctproblem19 = pref2.getBoolean("Problem19", false);
            correctproblem20 = pref2.getBoolean("Problem20", false);
        }

        Problem1Fragment problem1Fragment = new Problem1Fragment();
        Problem2Fragment problem2Fragment = new Problem2Fragment();
        Problem3Fragment problem3Fragment = new Problem3Fragment();
        Problem4Fragment problem4Fragment = new Problem4Fragment();
        Problem5Fragment problem5Fragment = new Problem5Fragment();
        Problem6Fragment problem6Fragment = new Problem6Fragment();
        Problem7Fragment problem7Fragment = new Problem7Fragment();
        Problem8Fragment problem8Fragment = new Problem8Fragment();
        Problem9Fragment problem9Fragment = new Problem9Fragment();
        Problem10Fragment problem10Fragment = new Problem10Fragment();
        Problem11Fragment problem11Fragment = new Problem11Fragment();
        Problem12Fragment problem12Fragment = new Problem12Fragment();
        Problem13Fragment problem13Fragment = new Problem13Fragment();
        Problem14Fragment problem14Fragment = new Problem14Fragment();
        Problem15Fragment problem15Fragment = new Problem15Fragment();
        Problem16Fragment problem16Fragment = new Problem16Fragment();
        Problem17Fragment problem17Fragment = new Problem17Fragment();
        Problem18Fragment problem18Fragment = new Problem18Fragment();
        Problem19Fragment problem19Fragment = new Problem19Fragment();
        Problem20Fragment problem20Fragment = new Problem20Fragment();

        ElementGameFragment elementGameFragment = new ElementGameFragment();


        Button problem1 = rootView.findViewById(R.id.problem1);
        if (correctproblem1) {
            problem1.setBackgroundResource(R.color.black);
            problem1.setTextColor(getContext().getColorStateList(R.color.white));
        }
        problem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, problem1Fragment).commit();
            }
        });

        Button problem2 = rootView.findViewById(R.id.problem2);
        if (correctproblem1) {
            if (correctproblem2) {
                problem2.setBackgroundResource(R.color.black);
                problem2.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem2.setBackgroundResource(R.color.dark_gray);
                problem2.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem2Fragment).commit();
                }
            });
        }


        Button problem3 = rootView.findViewById(R.id.problem3);
        if (correctproblem2) {
            if (correctproblem3) {
                problem3.setBackgroundResource(R.color.black);
                problem3.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem3.setBackgroundResource(R.color.dark_gray);
                problem3.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem3Fragment).commit();
                }
            });
        }

        Button problem4 = rootView.findViewById(R.id.problem4);
        if (correctproblem3) {
            if (correctproblem4) {
                problem4.setBackgroundResource(R.color.black);
                problem4.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem4.setBackgroundResource(R.color.dark_gray);
                problem4.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem4Fragment).commit();
                }
            });
        }

        Button problem5 = rootView.findViewById(R.id.problem5);
        if (correctproblem4) {
            if (correctproblem5) {
                problem5.setBackgroundResource(R.color.black);
                problem5.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem5.setBackgroundResource(R.color.dark_gray);
                problem5.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem5Fragment).commit();
                }
            });
        }



        Button problem6 = rootView.findViewById(R.id.problem6);
        if (correctproblem5) {
            if (correctproblem6) {
                problem6.setBackgroundResource(R.color.black);
                problem6.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem6.setBackgroundResource(R.color.dark_gray);
                problem6.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem6Fragment).commit();
                }
            });
        }

        Button problem7 = rootView.findViewById(R.id.problem7);
        if (correctproblem6) {
            if (correctproblem7) {
                problem7.setBackgroundResource(R.color.black);
                problem7.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem7.setBackgroundResource(R.color.dark_gray);
                problem7.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem7Fragment).commit();
                }
            });
        }

        Button problem8 = rootView.findViewById(R.id.problem8);
        if (correctproblem7) {
            if (correctproblem8) {
                problem8.setBackgroundResource(R.color.black);
                problem8.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem8.setBackgroundResource(R.color.dark_gray);
                problem8.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem8Fragment).commit();
                }
            });
        }



        Button problem9 = rootView.findViewById(R.id.problem9);
        if (correctproblem8) {
            if (correctproblem9) {
                problem9.setBackgroundResource(R.color.black);
                problem9.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem9.setBackgroundResource(R.color.dark_gray);
                problem9.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem9Fragment).commit();
                }
            });
        }

        Button problem10 = rootView.findViewById(R.id.problem10);
        if (correctproblem9) {
            if (correctproblem10) {
                problem10.setBackgroundResource(R.color.black);
                problem10.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem10.setBackgroundResource(R.color.dark_gray);
                problem10.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem10Fragment).commit();
                }
            });
        }


        Button problem11 = rootView.findViewById(R.id.problem11);
        if (correctproblem10) {
            if (correctproblem11) {
                problem11.setBackgroundResource(R.color.black);
                problem11.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem11.setBackgroundResource(R.color.dark_gray);
                problem11.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem11Fragment).commit();
                }
            });
        }



        Button problem12 = rootView.findViewById(R.id.problem12);
        if (correctproblem11) {
            if (correctproblem12) {
                problem12.setBackgroundResource(R.color.black);
                problem12.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem12.setBackgroundResource(R.color.dark_gray);
                problem12.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem12Fragment).commit();
                }
            });
        }



        Button problem13 = rootView.findViewById(R.id.problem13);
        if (correctproblem12) {
            if (correctproblem13) {
                problem13.setBackgroundResource(R.color.black);
                problem13.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem13.setBackgroundResource(R.color.dark_gray);
                problem13.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem13Fragment).commit();
                }
            });
        }


        Button problem14 = rootView.findViewById(R.id.problem14);
        if (correctproblem13) {
            if (correctproblem14) {
                problem14.setBackgroundResource(R.color.black);
                problem14.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem14.setBackgroundResource(R.color.dark_gray);
                problem14.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem14Fragment).commit();
                }
            });
        }



        Button problem15 = rootView.findViewById(R.id.problem15);
        if (correctproblem14) {
            if (correctproblem15) {
                problem15.setBackgroundResource(R.color.black);
                problem15.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem15.setBackgroundResource(R.color.dark_gray);
                problem15.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem15Fragment).commit();
                }
            });
        }

        Button problem16 = rootView.findViewById(R.id.problem16);
        if (correctproblem15) {
            if (correctproblem16) {
                problem16.setBackgroundResource(R.color.black);
                problem16.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem16.setBackgroundResource(R.color.dark_gray);
                problem16.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem16Fragment).commit();
                }
            });
        }


        Button problem17 = rootView.findViewById(R.id.problem17);
        if (correctproblem16) {
            if (correctproblem17) {
                problem17.setBackgroundResource(R.color.black);
                problem17.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem17.setBackgroundResource(R.color.dark_gray);
                problem17.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem17Fragment).commit();
                }
            });
        }

        Button problem18 = rootView.findViewById(R.id.problem18);
        if (correctproblem17) {
            if (correctproblem18) {
                problem18.setBackgroundResource(R.color.black);
                problem18.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem18.setBackgroundResource(R.color.dark_gray);
                problem18.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem18Fragment).commit();
                }
            });
        }

        Button problem19 = rootView.findViewById(R.id.problem19);
        if (correctproblem18) {
            if (correctproblem19) {
                problem19.setBackgroundResource(R.color.black);
                problem19.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem19.setBackgroundResource(R.color.dark_gray);
                problem19.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem19Fragment).commit();
                }
            });
        }


        Button problem20 = rootView.findViewById(R.id.problem20);
        if (correctproblem19) {
            if (correctproblem20) {
                problem20.setBackgroundResource(R.color.black);
                problem20.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problem20.setBackgroundResource(R.color.dark_gray);
                problem20.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problem20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problem20Fragment).commit();
                }
            });

        }

        Button elementQuizBackButton = rootView.findViewById(R.id.elementQuizBackButton);
        elementQuizBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
            }
        });

        return rootView;
    }
}