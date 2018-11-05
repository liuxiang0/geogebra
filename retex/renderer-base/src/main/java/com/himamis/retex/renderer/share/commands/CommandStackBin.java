package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.Atom;
import com.himamis.retex.renderer.share.TeXConstants;
import com.himamis.retex.renderer.share.TeXLength;
import com.himamis.retex.renderer.share.TeXParser;
import com.himamis.retex.renderer.share.UnderOverAtom;

public class CommandStackBin extends Command1O2A {

	@Override
	public Atom newI(TeXParser tp, Atom a, Atom b, Atom c) {
		final Atom at = new UnderOverAtom(c, a,
				new TeXLength(TeXLength.Unit.MU, 3.5), true, b,
				new TeXLength(TeXLength.Unit.MU, 3.), true);
		return at.changeType(TeXConstants.TYPE_BINARY_OPERATOR);
	}
}
