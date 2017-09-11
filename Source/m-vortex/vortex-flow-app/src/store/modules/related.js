/**
 * Created by FMISSER on 2017/6/12.
 * Description:
 */
import * as types from '../mutation-types'
import * as API from '../../api/rest-api'
import * as supporter from '../state-supporter'
import Vue from 'vue'

const state = {
  limit: 10,
  offset: 0,
  lastCount: 0,
  related: null,
  status: null,
  shake: 0
}

const actions = {
  getRelatedList ({state, commit, rootState}, payload) {
    API.getRelated(rootState.token)
      .then(function (data) {
        commit(types.GET_RELATED_LIST_SUCCEED, data)
      })
      .catch(function (err) {
        supporter.resolveError(rootState, err)
        commit(types.GET_RELATED_LIST_FAILED, err)
      })
  },

  relatedQuizDetail ({state, commit, rootState}, payload) {
    API.quizDetail(payload[0], rootState.token)
      .then(function (data) {
        // 如果当前详情页是同一个task 也推送数据给详情页
        if (rootState.quizDetail.taskId === payload[0]) {
          commit(types.GET_QUIZ_DETAIL_SUCCEED, data)
        }

        commit(types.GET_RELATED_ITEM_FOR_PUSH_SUCCESS, data)
      })
      .catch(function (err) {
        commit(types.GET_RELATED_ITEM_FOR_PUSH_FAILED, err)
      })
  }
}

const mutations = {

  [types.GET_RELATED_LIST_SUCCEED] (state, result) {
    state.related = result
    state.status = null
    state.shake++
  },

  [types.GET_RELATED_LIST_FAILED] (state, err) {
    state.related = null
    state.status = err
    state.shake++
  },

  [types.GET_RELATED_ITEM_FOR_PUSH_SUCCESS] (state, result) {
    let taskId = result.task_id
    for (var i = 0; i < state.related.length; i++) {
      if (state.related[i].task_id === taskId) {
        Vue.set(state.related, i, result)
        break
      }
    }
  },

  [types.GET_RELATED_ITEM_FOR_PUSH_FAILED] (state, err) {

  }
}

export default {
  state,
  actions,
  mutations
}