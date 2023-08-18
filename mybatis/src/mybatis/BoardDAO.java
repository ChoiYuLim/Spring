package mybatis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ibatis.session.SqlSession;

public class BoardDAO {
    private SqlSession sqlSession;

    public BoardDAO() {

    }

    public BoardDAO(SqlSession session) {
        this.sqlSession = session;
    }

    public void work() {
        // db에 sql 호출
        // insertNewPost();
        // selectAllPost();
        // selectByName2("최유림");
        // selectByNo2();
        // delete();
        // update();
        selectDynamicSQL();
    }

    public void insertNewPost() {
        // sqlSession.insert("mybatis.BoardDAO.insertNewPost");

        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("두번째제목이요");
        boardVO.setWriter("최민영");
        boardVO.setContent("내용이요");
        sqlSession.insert("mybatis.BoardDAO.insertNewPost2", boardVO);

        sqlSession.commit();
    }

    public void selectAllPost() {
        List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectAll");
        for (BoardVO boardVO : boardlist) {
            System.out.println(boardVO.toString());
        }
    }

    public void selectByName() {
        BoardVO boardVO = new BoardVO();
        boardVO.setWriter("최유림");
        List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectbyName", boardVO);
        for (BoardVO board : boardlist) {
            System.out.println(board.toString());
        }
    }

    public void selectByNo() {
        BoardVO boardVO = sqlSession.selectOne("mybatis.BoardDAO.selectbyNo", 3);
        System.out.println(boardVO.toString());
    }

    public void selectByNo2() {
        Map<String, Object> map = sqlSession.selectOne("mybatis.BoardDAO.selectbyNo2", 3);
        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public void selectByName2(String name) {

        List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectbyName2", name);
        for (BoardVO board : boardlist) {
            System.out.println(board.toString());
        }
    }

    public void delete() {
        sqlSession.delete("mybatis.BoardDAO.deletebyName", "최유림");
        sqlSession.commit();
    }

    public void update() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "new title");
        map.put("no", 4);
        sqlSession.update("mybatis.BoardDAO.updateByNo", map);
        sqlSession.commit();
    }

    public void selectDynamicSQL() {
        BoardVO inputboardVO = new BoardVO();
        inputboardVO.setTitle("new title");
        inputboardVO.setWriter("최민영");
        List<BoardVO> boardlist =
                sqlSession.selectList("mybatis.BoardDAO.selectDSQL", inputboardVO);
        for(BoardVO boardVO : boardlist) {
            System.out.println(boardVO);
        }
    }
    
    public void selectDynamicSQL2() {
        BoardVO inputboardVO = new BoardVO();
       // inputboardVO.setTitle("좋은아침");
        inputboardVO.setWriter("최유림");
        List<BoardVO> boardlist =
                sqlSession.selectList("mybatis.BoardDAO.selectDSQL2", inputboardVO);
        
        for(BoardVO boardVO : boardlist) {
            System.out.println(boardVO);
        }
    }
}
