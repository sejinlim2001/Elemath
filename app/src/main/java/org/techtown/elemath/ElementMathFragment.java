package org.techtown.elemath;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ElementMathFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_element_math, container, false);

        SoundSet.initSounds(getActivity());

        boolean correctproblemA = false;
        boolean correctproblemB = false;
        boolean correctproblemC = false;
        boolean correctproblemD = false;
        boolean correctproblemE = false;
        boolean correctproblemF = false;
        boolean correctproblemG = false;
        boolean correctproblemH = false;
        boolean correctproblemI = false;
        boolean correctproblemJ = false;
        boolean correctproblemK = false;
        boolean correctproblemL = false;
        boolean correctproblemM = false;
        boolean correctproblemN = false;
        boolean correctproblemO = false;
        boolean correctproblemP = false;
        boolean correctproblemQ = false;
        boolean correctproblemR = false;
        boolean correctproblemS = false;
        boolean correctproblemT = false;
        boolean correctproblemU = false;
        boolean correctproblemV = false;
        boolean correctproblemW = false;
        boolean correctproblemX = false;
        boolean correctproblemY = false;
        boolean correctproblemZ = false;


        SharedPreferences pref1 = getActivity().getSharedPreferences("pref1", Activity.MODE_PRIVATE);

        if (pref1 != null) {
            correctproblemA = pref1.getBoolean("ProblemA", false);
            correctproblemB = pref1.getBoolean("ProblemB", false);
            correctproblemC = pref1.getBoolean("ProblemC", false);
            correctproblemD = pref1.getBoolean("ProblemD", false);
            correctproblemE = pref1.getBoolean("ProblemE", false);
            correctproblemF = pref1.getBoolean("ProblemF", false);
            correctproblemG = pref1.getBoolean("ProblemG", false);
            correctproblemH = pref1.getBoolean("ProblemH", false);
            correctproblemI = pref1.getBoolean("ProblemI", false);
            correctproblemJ = pref1.getBoolean("ProblemJ", false);
            correctproblemK = pref1.getBoolean("ProblemK", false);
            correctproblemL = pref1.getBoolean("ProblemL", false);
            correctproblemM = pref1.getBoolean("ProblemM", false);
            correctproblemN = pref1.getBoolean("ProblemN", false);
            correctproblemO = pref1.getBoolean("ProblemO", false);
            correctproblemP = pref1.getBoolean("ProblemP", false);
            correctproblemQ = pref1.getBoolean("ProblemQ", false);
            correctproblemR = pref1.getBoolean("ProblemR", false);
            correctproblemS = pref1.getBoolean("ProblemS", false);
            correctproblemT = pref1.getBoolean("ProblemT", false);
            correctproblemU = pref1.getBoolean("ProblemU", false);
            correctproblemV = pref1.getBoolean("ProblemV", false);
            correctproblemW = pref1.getBoolean("ProblemW", false);
            correctproblemX = pref1.getBoolean("ProblemX", false);
            correctproblemY = pref1.getBoolean("ProblemY", false);
            correctproblemZ = pref1.getBoolean("ProblemA", false);
        }

        ProblemaFragment problemaFragment = new ProblemaFragment();
        ProblembFragment problembFragment = new ProblembFragment();
        ProblemcFragment problemcFragment = new ProblemcFragment();
        ProblemdFragment problemdFragment = new ProblemdFragment();
        ProblemeFragment problemeFragment = new ProblemeFragment();
        ProblemfFragment problemfFragment = new ProblemfFragment();
        ProblemgFragment problemgFragment = new ProblemgFragment();
        ProblemhFragment problemhFragment = new ProblemhFragment();
        ProblemiFragment problemiFragment = new ProblemiFragment();
        ProblemjFragment problemjFragment = new ProblemjFragment();
        ProblemkFragment problemkFragment = new ProblemkFragment();
        ProblemlFragment problemlFragment = new ProblemlFragment();
        ProblemmFragment problemmFragment = new ProblemmFragment();
        ProblemnFragment problemnFragment = new ProblemnFragment();
        ProblemoFragment problemoFragment = new ProblemoFragment();
        ProblempFragment problempFragment = new ProblempFragment();
        ProblemqFragment problemqFragment = new ProblemqFragment();
        ProblemrFragment problemrFragment = new ProblemrFragment();
        ProblemsFragment problemsFragment = new ProblemsFragment();
        ProblemtFragment problemtFragment = new ProblemtFragment();
        ProblemuFragment problemuFragment = new ProblemuFragment();
        ProblemvFragment problemvFragment = new ProblemvFragment();
        ProblemwFragment problemwFragment = new ProblemwFragment();
        ProblemxFragment problemxFragment = new ProblemxFragment();
        ProblemyFragment problemyFragment = new ProblemyFragment();
        ProblemzFragment problemzFragment = new ProblemzFragment();

        ElementGameFragment elementGameFragment = new ElementGameFragment();


        Button problema = rootView.findViewById(R.id.problema);
        if (correctproblemA) {
            problema.setBackgroundResource(R.color.black);
            problema.setTextColor(getContext().getColorStateList(R.color.white));
        }
        problema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, problemaFragment).commit();
            }
        });

        Button problemb = rootView.findViewById(R.id.problemb);
        if (correctproblemA) {
            if (correctproblemB) {
                problemb.setBackgroundResource(R.color.black);
                problemb.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemb.setBackgroundResource(R.color.dark_gray);
                problemb.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problembFragment).commit();
                }
            });
        }


        Button problemc = rootView.findViewById(R.id.problemc);
        if (correctproblemB) {
            if (correctproblemC) {
                problemc.setBackgroundResource(R.color.black);
                problemc.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemc.setBackgroundResource(R.color.dark_gray);
                problemc.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemcFragment).commit();
                }
            });
        }

        Button problemd = rootView.findViewById(R.id.problemd);
        if (correctproblemC) {
            if (correctproblemD) {
                problemd.setBackgroundResource(R.color.black);
                problemd.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemd.setBackgroundResource(R.color.dark_gray);
                problemd.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemdFragment).commit();
                }
            });
        }

        Button probleme = rootView.findViewById(R.id.probleme);
        if (correctproblemD) {
            if (correctproblemE) {
                probleme.setBackgroundResource(R.color.black);
                probleme.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                probleme.setBackgroundResource(R.color.dark_gray);
                probleme.setTextColor(getContext().getColorStateList(R.color.white));
            }
            probleme.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemeFragment).commit();
                }
            });
        }



        Button problemf = rootView.findViewById(R.id.problemf);
        if (correctproblemE) {
            if (correctproblemF) {
                problemf.setBackgroundResource(R.color.black);
                problemf.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemf.setBackgroundResource(R.color.dark_gray);
                problemf.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemfFragment).commit();
                }
            });
        }

        Button problemg = rootView.findViewById(R.id.problemg);
        if (correctproblemF) {
            if (correctproblemG) {
                problemg.setBackgroundResource(R.color.black);
                problemg.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemg.setBackgroundResource(R.color.dark_gray);
                problemg.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemgFragment).commit();
                }
            });
        }

        Button problemh = rootView.findViewById(R.id.problemh);
        if (correctproblemG) {
            if (correctproblemH) {
                problemh.setBackgroundResource(R.color.black);
                problemh.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemh.setBackgroundResource(R.color.dark_gray);
                problemh.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemhFragment).commit();
                }
            });
        }



        Button problemi = rootView.findViewById(R.id.problemi);
        if (correctproblemH) {
            if (correctproblemI) {
                problemi.setBackgroundResource(R.color.black);
                problemi.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemi.setBackgroundResource(R.color.dark_gray);
                problemi.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemiFragment).commit();
                }
            });
        }

        Button problemj = rootView.findViewById(R.id.problemj);
        if (correctproblemI) {
            if (correctproblemJ) {
                problemj.setBackgroundResource(R.color.black);
                problemj.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemj.setBackgroundResource(R.color.dark_gray);
                problemj.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemj.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemjFragment).commit();
                }
            });
        }


        Button problemk = rootView.findViewById(R.id.problemk);
        if (correctproblemJ) {
            if (correctproblemK) {
                problemk.setBackgroundResource(R.color.black);
                problemk.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemk.setBackgroundResource(R.color.dark_gray);
                problemk.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemkFragment).commit();
                }
            });
        }



        Button probleml = rootView.findViewById(R.id.probleml);
        if (correctproblemK) {
            if (correctproblemL) {
                probleml.setBackgroundResource(R.color.black);
                probleml.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                probleml.setBackgroundResource(R.color.dark_gray);
                probleml.setTextColor(getContext().getColorStateList(R.color.white));
            }
            probleml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemlFragment).commit();
                }
            });
        }



        Button problemm = rootView.findViewById(R.id.problemm);
        if (correctproblemL) {
            if (correctproblemM) {
                problemm.setBackgroundResource(R.color.black);
                problemm.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemm.setBackgroundResource(R.color.dark_gray);
                problemm.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemmFragment).commit();
                }
            });
        }


        Button problemn = rootView.findViewById(R.id.problemn);
        if (correctproblemM) {
            if (correctproblemN) {
                problemn.setBackgroundResource(R.color.black);
                problemn.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemn.setBackgroundResource(R.color.dark_gray);
                problemn.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemnFragment).commit();
                }
            });
        }



        Button problemo = rootView.findViewById(R.id.problemo);
        if (correctproblemN) {
            if (correctproblemO) {
                problemo.setBackgroundResource(R.color.black);
                problemo.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemo.setBackgroundResource(R.color.dark_gray);
                problemo.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemoFragment).commit();
                }
            });
        }

        Button problemp = rootView.findViewById(R.id.problemp);
        if (correctproblemO) {
            if (correctproblemP) {
                problemp.setBackgroundResource(R.color.black);
                problemp.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemp.setBackgroundResource(R.color.dark_gray);
                problemp.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problempFragment).commit();
                }
            });
        }


        Button problemq = rootView.findViewById(R.id.problemq);
        if (correctproblemP) {
            if (correctproblemQ) {
                problemq.setBackgroundResource(R.color.black);
                problemq.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemq.setBackgroundResource(R.color.dark_gray);
                problemq.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemqFragment).commit();
                }
            });
        }

        Button problemr = rootView.findViewById(R.id.problemr);
        if (correctproblemQ) {
            if (correctproblemR) {
                problemr.setBackgroundResource(R.color.black);
                problemr.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemr.setBackgroundResource(R.color.dark_gray);
                problemr.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemrFragment).commit();
                }
            });
        }

        Button problems = rootView.findViewById(R.id.problems);
        if (correctproblemR) {
            if (correctproblemS) {
                problems.setBackgroundResource(R.color.black);
                problems.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problems.setBackgroundResource(R.color.dark_gray);
                problems.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problems.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemsFragment).commit();
                }
            });
        }


        Button problemt = rootView.findViewById(R.id.problemt);
        if (correctproblemS) {
            if (correctproblemT) {
                problemt.setBackgroundResource(R.color.black);
                problemt.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemt.setBackgroundResource(R.color.dark_gray);
                problemt.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemtFragment).commit();
                }
            });

        }

        Button problemu = rootView.findViewById(R.id.problemu);
        if (correctproblemT) {
            if (correctproblemU) {
                problemu.setBackgroundResource(R.color.black);
                problemu.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemu.setBackgroundResource(R.color.dark_gray);
                problemu.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemuFragment).commit();
                }
            });
        }


        Button problemv = rootView.findViewById(R.id.problemv);
        if (correctproblemU) {
            if (correctproblemV) {
                problemv.setBackgroundResource(R.color.black);
                problemv.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemv.setBackgroundResource(R.color.dark_gray);
                problemv.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemvFragment).commit();
                }
            });
        }

        Button problemw = rootView.findViewById(R.id.problemw);
        if (correctproblemV) {
            if (correctproblemW) {
                problemw.setBackgroundResource(R.color.black);
                problemw.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemw.setBackgroundResource(R.color.dark_gray);
                problemw.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemw.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemwFragment).commit();
                }
            });
        }


        Button problemx = rootView.findViewById(R.id.problemx);
        if (correctproblemW) {
            if (correctproblemX) {
                problemx.setBackgroundResource(R.color.black);
                problemx.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemx.setBackgroundResource(R.color.dark_gray);
                problemx.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemxFragment).commit();
                }
            });
        }

        Button problemy = rootView.findViewById(R.id.problemy);
        if (correctproblemX) {
            if (correctproblemY) {
                problemy.setBackgroundResource(R.color.black);
                problemy.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemy.setBackgroundResource(R.color.dark_gray);
                problemy.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemyFragment).commit();
                }
            });
        }

        Button problemz = rootView.findViewById(R.id.problemz);
        if (correctproblemY) {
            if (correctproblemZ) {
                problemz.setBackgroundResource(R.color.black);
                problemz.setTextColor(getContext().getColorStateList(R.color.white));
            } else {
                problemz.setBackgroundResource(R.color.dark_gray);
                problemz.setTextColor(getContext().getColorStateList(R.color.white));
            }
            problemz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SoundSet.play(SoundSet.buttonSound);
                    getParentFragmentManager().beginTransaction().replace(R.id.container, problemzFragment).commit();
                }
            });
        }

        Button elementMathBackButton = rootView.findViewById(R.id.elementMathBackButton);
        elementMathBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
            }
        });

        return rootView;
    }

}