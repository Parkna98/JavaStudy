package com.sist.main;

import com.sist.manager.*;


/*
 * <tr class="list" songid="103151984"> // 지니뮤직 웹상에 Love Lee 곡 한줄로 출력된 부분
                                <td class="check"><input type="checkbox" class="select-check" title="Love Lee" /></td>
                                <td class="number">1
                                        
                                    <span class="rank">
                                                <span class="rank"><span class="rank-none"><span
                                                        class="hide">유지</span></span></span>
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('84181610');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/084/181/610/84181610_1692585955705_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="Love Lee" /></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('103151984');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('103151984','1');return false;">
                                                Love Lee</a>

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('80197389');return false;">AKMU (악뮤)</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('103151984');">외</button>
                                            <ul class="list" id="RelationArtist_103151984"></ul>
                                        </div>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('84181610');return false;">Love Lee</a>
                                </td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('103151984;' ,'1'); return false;">듣기</a></td>
                                        <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('103151984;' ,'3'); return false;">재생목록에 추가</a></td>
                                    
                                    
                                
                                <td class="btns"><button type="button" class="btn-basic btn-album" songId="103151984" id="add_my_album_103151984" onclick="fnAddMyAlbumForm('#add_my_album_103151984' , '103151984' ,10, 10);return false;">플레이리스트에 담기</button></td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('103151984');return false;">다운로드</a></td>
                                <td class="btns">
                                    <div class="toggle-button-box lyr-mv" id="list-mv_103151984">
                                        
                                            
                                                <a href="#" class="btn btn-basic btn-mv" title="뮤비" alt="Love Lee" onclick="fnPlayMv('103151984','3'); return false;">뮤직비디오 보기</a>
                                    </div>
                                </td>
                                <td class="more">
                                    <div class="toggle-button-box">
                                        <button type="button" class="btn btn-basic btn-more">더보기</button>
                                        <ul class="list">
                                            
                                                
                                                    <li><a href="#" class="item" title="공유" onclick="shareDo('103151984');return false;">공유하기/음악나누기</a></li>
                                                    <li><a href="#" class="item" title="선물" onclick="fnGiftSong('103151984');return false;">선물하기</a></li>
                                        </ul>
                                    </div>
                                </td>
                            </tr>
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms=new MusicSystem();
		for(Music m:ms.getMusics())
		{
			System.out.println(m.getMno()+"."+m.getTitle()); // 값을 읽어오려면 get메소드, 저장하려면 set메소드
		}
	}

}
