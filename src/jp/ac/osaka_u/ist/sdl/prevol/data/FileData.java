package jp.ac.osaka_u.ist.sdl.prevol.data;

import java.util.concurrent.atomic.AtomicLong;

/**
 * ファイルを表すクラス
 * 
 * @author k-hotta
 * 
 */
public class FileData extends AbstractElement {

	/**
	 * ID管理用カウンタ
	 */
	private static final AtomicLong count = new AtomicLong(0);

	/**
	 * このファイルの生存期間の先頭リビジョンのID
	 */
	private final long startRevisionId;

	/**
	 * このファイルの生存期間の最終リビジョンのID
	 */
	private final long endRevisionId;

	/**
	 * ファイルパス
	 */
	private final String path;

	public FileData(final long startRevisionId, final long endRevisionId,
			final String path) {
		super(count.getAndIncrement());
		this.startRevisionId = startRevisionId;
		this.endRevisionId = endRevisionId;
		this.path = path;
	}

	/*
	 * ゲッタ群
	 */

	public final long getStartRevisionId() {
		return startRevisionId;
	}

	public final long getEndRevisionId() {
		return endRevisionId;
	}

	public final String getPath() {
		return path;
	}

}
